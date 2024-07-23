package com.banking.util;

import com.banking.model.Transaction;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

public class PDFGenerator {

    public static void generateTransactionsPDF(List<Transaction> transactions, HttpServletResponse response) throws IOException {
        Document document = new Document();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            PdfWriter.getInstance(document, baos);
            document.open();
            document.add(new Paragraph("Last 10 Transactions"));
            document.add(new Paragraph(" "));
            
            for (Transaction transaction : transactions) {
                document.add(new Paragraph("Transaction ID: " + transaction.getTransactionId()));
                document.add(new Paragraph("Account No: " + transaction.getAccountNo()));
                document.add(new Paragraph("Transaction Type: " + transaction.getTransactionType()));
                document.add(new Paragraph("Amount: " + transaction.getAmount()));
                document.add(new Paragraph("Date: " + transaction.getTransactionDate()));
                
                document.add(new Paragraph(" "));
            }
            
            document.close();
        } catch (DocumentException e) {
            throw new IOException(e);
        }

        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "attachment;filename=Last10Transactions.pdf");
        ServletOutputStream outputStream = response.getOutputStream();
        baos.writeTo(outputStream);
        outputStream.flush();
        outputStream.close();
    }
}
