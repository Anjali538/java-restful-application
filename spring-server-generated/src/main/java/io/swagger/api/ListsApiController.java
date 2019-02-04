package io.swagger.api;

import io.swagger.model.ListItem;
import org.threeten.bp.LocalDate;
import io.swagger.model.RMSList;
import io.swagger.model.RMSListDetails;
import io.swagger.model.StandardError;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-02-02T10:28:28.762Z[GMT]")
@Controller
public class ListsApiController implements ListsApi {

    private static final Logger log = LoggerFactory.getLogger(ListsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ListsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<RMSList> getListById(@ApiParam(value = "Unique Id to identify the RMS list data.",required=true) @PathVariable("list-id") String listId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<RMSList>(HttpStatus.NOT_IMPLEMENTED);
    }


    public ResponseEntity<List<RMSListDetails>> getRMSListDetails(@ApiParam(value = "time stamp when List is modified in MDM.") @Valid @RequestParam(value = "ModifiedTime", required = false) String modifiedTime) {
        String accept = request.getHeader("Accept");
        
        if(accept != null && accept.contains("application/json")) {
        	
        	try {
        		RMSListDetails llRMSListDetails  = new RMSListDetails();
        		RMSListDetails lllRMSListDetails  = new RMSListDetails();
        		List<RMSListDetails> llRMSListDetailsList= new ArrayList<RMSListDetails>();
        		llRMSListDetails.setListID("1");
        		llRMSListDetails.setListName("ankur");
        		lllRMSListDetails.setListID("2");
        		lllRMSListDetails.setListName("anjali");
        		llRMSListDetailsList.add(llRMSListDetails);
        		llRMSListDetailsList.add(lllRMSListDetails);
        		if(modifiedTime!=null) {
//        			String sDate1="2/2/2019, 8:22:17 PM";  
            	    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(modifiedTime); 
            	    
            	    System.out.println("ModifiedTime" +"\t"+date1); 
            	    
            	    Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(modifiedTime);

            	    if(date1.equals(date2)||date1.after(date2)) {
            			List<RMSListDetails> filteredData= new ArrayList<RMSListDetails>();
                		for(int i=0;i<llRMSListDetailsList.size();i++) {
                			if(llRMSListDetailsList.get(i).getListID().contains("1")) {
                				filteredData.add(llRMSListDetailsList.get(i));
                				System.out.println("3456789sdfghjk");
                        		return new ResponseEntity<List<RMSListDetails>>(filteredData, HttpStatus.OK);
                			}
                			else {
                				continue;
                			}
                		}
            		}
            	
            		else {
            			log.info("No");
            		}
        		}else {
        			return new ResponseEntity<List<RMSListDetails>>(llRMSListDetailsList, HttpStatus.OK);
        		}
           
        	}
        	catch(Exception e){
        		log.error("Not found", e);
        		return new ResponseEntity<List<RMSListDetails>>(HttpStatus.INTERNAL_SERVER_ERROR);
        	}
        }
        
        return new ResponseEntity<List<RMSListDetails>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ListItem> getTermById(@ApiParam(value = "Unique Id to identify the all terms of a list.",required=true) @PathVariable("list-id") String listId,@ApiParam(value = "Unique Id to identify the particular term of a list.",required=true) @PathVariable("term-id") String termId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<ListItem>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ListItem>> getTermsByListId(@ApiParam(value = "Unique ID to identify the all terms of a list.",required=true) @PathVariable("list-id") String listId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<List<ListItem>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
