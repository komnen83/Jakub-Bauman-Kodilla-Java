package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    private final static String INVOICE = "Invoice no.1";

    @Test
    public void testInvoiceDaoSave() {

        Product graphicDesign = new Product("Graphic Design");
        Product webDesign = new Product("Web Design");

        Item graphicDesignItem = new Item(graphicDesign, new BigDecimal(20), 4, new BigDecimal(80));
        Item webDesignItem = new Item(webDesign, new BigDecimal(10), 3, new BigDecimal(30));

        List<Item> items = new ArrayList<>();
        items.add(graphicDesignItem);
        items.add(webDesignItem);

        Invoice invoice = new Invoice(INVOICE, items);
        invoice.getItems().add(graphicDesignItem);
        invoice.getItems().add(webDesignItem);

        invoiceDao.save(invoice);
        int invoiceID = invoice.getId();

        Assert.assertNotEquals(0, invoiceID);

    }
}
