package io.swagger.api;

import io.swagger.model.ListItem;
import org.threeten.bp.LocalDate;
import io.swagger.model.RMSList;
import io.swagger.model.RMSListDetails;
import io.swagger.model.StandardError;

import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ListsApiControllerIntegrationTest {

    @Autowired
    private ListsApi api;

    @Test
    public void getListByIdTest() throws Exception {
        String listId = "listId_example";
        ResponseEntity<RMSList> responseEntity = api.getListById(listId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

	/*
	 * @Test public void getRMSListDetailsTest() throws Exception { LocalDate
	 * modifiedTime = new LocalDate(); ResponseEntity<List<RMSListDetails>>
	 * responseEntity = api.getRMSListDetails(modifiedTime);
	 * assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode()); }
	 */

    @Test
    public void getTermByIdTest() throws Exception {
        String listId = "listId_example";
        String termId = "termId_example";
        ResponseEntity<ListItem> responseEntity = api.getTermById(listId, termId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getTermsByListIdTest() throws Exception {
        String listId = "listId_example";
        ResponseEntity<List<ListItem>> responseEntity = api.getTermsByListId(listId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
