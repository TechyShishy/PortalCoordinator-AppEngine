package com.shishire.portalcoordinator.appengine;

import java.util.TreeSet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "deploymentSet")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class DeploymentSet
{
	protected TreeSet<ResonatorDeployment> deployments = new TreeSet<ResonatorDeployment>();

	/**
	 * @return the deployments
	 */
	public TreeSet<ResonatorDeployment> getDeployments()
	{
		return deployments;
	}

	/**
	 * @param deployments
	 *            the deployments to set
	 */
	public void setDeployments(TreeSet<ResonatorDeployment> deployments)
	{
		this.deployments = deployments;
	}

	public void addDeployment(ResonatorDeployment deployment)
	{
		this.deployments.add(deployment);
	}

}
