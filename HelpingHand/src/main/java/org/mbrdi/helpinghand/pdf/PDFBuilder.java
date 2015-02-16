package org.mbrdi.helpinghand.pdf;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * This view class generates a PDF document 'on the fly' based on the data
 * contained in the model.
 * @author www.codejava.net
 *
 */
public class PDFBuilder extends AbstractITextPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document doc,
			PdfWriter writer, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// get data model which is passed by the Spring container
		List<PDFReciept> listReciepts = (List<PDFReciept>) model.get("listReciepts");
		
        
		doc.add(new Paragraph("\n"+"\n"+"\n"));
		
		PdfPTable table = new PdfPTable(3);
		table.setWidthPercentage(100.0f);
		table.setWidths(new float[] {6.0f, 10.0f, 3.0f});
		table.setSpacingBefore(10);
		
		// define font for table header row
		Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
		font.setColor(BaseColor.WHITE);
		font.setSize(20);
		
		// define table header cell
		PdfPCell cell = new PdfPCell();
		cell.setBackgroundColor(BaseColor.BLUE);
		cell.setPadding(5);
		cell.setVerticalAlignment(Element.ALIGN_TOP);
		
		if(!listReciepts.isEmpty() && listReciepts.get(0)!=null){
		// write table header 
			PDFReciept pdfReciept = listReciepts.get(0);
		String str= "Donation reciept from" + pdfReciept.getTitle();
		cell.setPhrase(new Phrase(str, font));
		cell.setColspan(3);
        table.addCell(cell);
        //empty row
        cell =new PdfPCell(new Phrase(" "));
        cell.setColspan(3);
        table.addCell(cell);
        
        table.addCell("Name");//constant
        cell = new PdfPCell(new Phrase(pdfReciept.getNameOfDonator()));
        cell.setColspan(2);
        table.addCell(cell);
        
        table.addCell("Amount");//constant
        cell = new PdfPCell(new Phrase(String.valueOf(pdfReciept.getDonationAmount())));
        cell.setColspan(2);
        table.addCell(cell);
        
        table.addCell("Description of Donation"); //constant
        cell = new PdfPCell(new Phrase(pdfReciept.getdetailsOfEntry()));
        cell.setColspan(2);
        table.addCell(cell);
        
      //empty row
        cell =new PdfPCell(new Phrase(" "));
        cell.setColspan(3);
        table.addCell(cell);
        // now we add a cell with rowspan 2
        cell = new PdfPCell(new Phrase("Signature")); //constant
        cell.setRowspan(2);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell.setVerticalAlignment(Element.ALIGN_TOP);
        table.addCell(cell);
        // we add the four remaining cells with addCell()
        cell = new PdfPCell(new Phrase(pdfReciept.getSignatureImage()));
        cell.setColspan(2);
        table.addCell(cell);
        
        String strr = pdfReciept.getNameOfSignatory() +" - " +pdfReciept.getTitle();
        cell = new PdfPCell(new Phrase(strr));
        cell.setColspan(2);
        table.addCell(cell);
		}
        
	
		// write table row data
		/*for (PDFReciept aReciept : listReciepts) {
			table.addCell(aReciept.getTitle());
			table.addCell(aReciept.getAuthor());
			table.addCell(aReciept.getIsbn());
			table.addCell(aReciept.getPublishedDate());
			table.addCell(String.valueOf(aReciept.getPrice()));
		}*/
		
		doc.add(table);
		
	}

}