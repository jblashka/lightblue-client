package com.redhat.lightblue.client.request.metadata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.redhat.lightblue.client.request.AbstractLightblueRequestTest;

public class TestMetadataGetEntityRolesRequest extends AbstractLightblueRequestTest {

	MetadataGetEntityRolesRequest request = new MetadataGetEntityRolesRequest();

	@Before
	public void setUp() throws Exception {
		request = new MetadataGetEntityRolesRequest(entityName, entityVersion);
	}

	@Test
	public void testGetOperationPathParam() {
		Assert.assertEquals(MetadataGetEntityRolesRequest.PATH_PARAM_GET_ENTITY_ROLES, request.getOperationPathParam());
	}

}
