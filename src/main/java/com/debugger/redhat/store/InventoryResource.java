package com.debugger.redhat.store;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.PathParam;

@Path("/api/inventory")
@ApplicationScoped
public class InventoryResource {
	
	@GET
	@Path("/{itemId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Inventory getAvailability(@PathParam("itemId") long itemId) {
		Inventory inventory = Inventory.findById(itemId);
		return inventory;
	}
	

}
