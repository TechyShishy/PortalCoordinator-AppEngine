package com.shishire.portalcoordinator.appengine;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/event")
public class EventAPI
{
	protected EventDescriptor dummyEvent = new EventDescriptor();
	{
		ResonatorDeployment shishireDeployment1 = new ResonatorDeployment();
		shishireDeployment1.setDeploymentLevel(ResonatorDeployment.DeploymentLevel.L6);
		shishireDeployment1.setDeploymentType(ResonatorDeployment.DeploymentType.RESONATOR);
		shishireDeployment1.setDeploymentSlot(ResonatorDeployment.DeploymentSlot.SOUTHEAST);
		shishireDeployment1.setDeploymentOrdinal(1);
		shishireDeployment1.setPortalName("Cooper's Tavern");

		ResonatorDeployment shishireDeployment2 = new ResonatorDeployment();
		shishireDeployment2.setDeploymentLevel(ResonatorDeployment.DeploymentLevel.L6);
		shishireDeployment2.setDeploymentType(ResonatorDeployment.DeploymentType.RESONATOR);
		shishireDeployment2.setDeploymentSlot(ResonatorDeployment.DeploymentSlot.SOUTHWEST);
		shishireDeployment2.setDeploymentOrdinal(2);
		shishireDeployment2.setPortalName("Cooper's Tavern");

		ResonatorDeployment shishireDeployment3 = new ResonatorDeployment();
		shishireDeployment3.setDeploymentLevel(ResonatorDeployment.DeploymentLevel.L5);
		shishireDeployment3.setDeploymentType(ResonatorDeployment.DeploymentType.RESONATOR);
		shishireDeployment3.setDeploymentSlot(ResonatorDeployment.DeploymentSlot.NORTH);
		shishireDeployment3.setDeploymentOrdinal(3);
		shishireDeployment3.setPortalName("Reagent Theater");

		DeploymentSet shishireDeploymentSet = new DeploymentSet();
		shishireDeploymentSet.addDeployment(shishireDeployment1);
		shishireDeploymentSet.addDeployment(shishireDeployment2);
		shishireDeploymentSet.addDeployment(shishireDeployment3);

		dummyEvent.addParticipant(new Participant("Shishire"), shishireDeploymentSet);
	}

	@PUT
	@Consumes(
	{
	    "application/json", "text/xml"
	})
	public void createEvent(@PathParam("eventid") Integer eventId, EventDescriptor event)
	{

	}

	@Path("/{eventId: [0-9]+}")
	@Produces(
	{
	    "application/json", "text/xml"
	})
	public EventDescriptor getEvent(@PathParam("eventId") Integer eventId)
	{
		return this.dummyEvent;
	}
}
