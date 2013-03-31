package com.shishire.portalcoordinator.appengine;

import java.util.HashMap;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "event")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class EventDescriptor
{
	protected HashMap<Participant, DeploymentSet> deploymentSets = new HashMap<Participant, DeploymentSet>();

	public void addParticipant(Participant participant, DeploymentSet deploymentSet)
	{
		deploymentSets.put(participant, deploymentSet);
	}

	public HashMap<Participant, DeploymentSet> getDeploymentSets()
	{
		return this.deploymentSets;
	}

	public void setDeploymentSets(HashMap<Participant, DeploymentSet> deploymentSets)
	{
		this.deploymentSets = deploymentSets;
	}

	@GET
	@Produces(
	{
	    "application/json", "text/xml"
	})
	@Path("/{participantId}")
	public DeploymentSet getDeploymentSetForParticipant(@PathParam("participantId") String participantId)
	{
		return this.deploymentSets.get(new Participant(participantId));
	}
}
