/**
 * 
 */
package com.shishire.portalcoordinator.appengine;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Shishire
 * 
 */
@XmlRootElement(name = "deployment")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class ResonatorDeployment implements Comparable<ResonatorDeployment>
{
	public enum DeploymentLevel
	{
		L1, L2, L3, L4, L5, L6, L7, L8, COMMON, RARE, VERYRARE
	}

	/**
	 * @author Shishire
	 * 
	 */
	public enum DeploymentSlot
	{
		EAST, NORTHEAST, NORTH, NORTHWEST, WEST, SOUTHWEST, SOUTH, SOUTHEAST, MOD1, MOD2, MOD3, MOD4
	}

	/**
	 * @author Shishire
	 * 
	 */
	public enum DeploymentType
	{
		RESONATOR, SHIELD
	}

	protected DeploymentLevel deploymentLevel;
	protected Integer deploymentOrdinal;
	protected DeploymentSlot deploymentSlot;
	protected DeploymentType deploymentType;
	protected String portalName;

	/**
	 * @return the deploymentLevel
	 */
	public DeploymentLevel getDeploymentLevel()
	{
		return deploymentLevel;
	}

	/**
	 * @param deploymentLevel
	 *            the deploymentLevel to set
	 */
	public void setDeploymentLevel(DeploymentLevel deploymentLevel)
	{
		this.deploymentLevel = deploymentLevel;
	}

	/**
	 * @return the deploymentOrdinal
	 */
	public Integer getDeploymentOrdinal()
	{
		return deploymentOrdinal;
	}

	/**
	 * @param deploymentOrdinal
	 *            the deploymentOrdinal to set
	 */
	public void setDeploymentOrdinal(Integer deploymentOrdinal)
	{
		this.deploymentOrdinal = deploymentOrdinal;
	}

	/**
	 * @return the deploymentSlot
	 */
	public DeploymentSlot getDeploymentSlot()
	{
		return deploymentSlot;
	}

	/**
	 * @param deploymentSlot
	 *            the deploymentSlot to set
	 */
	public void setDeploymentSlot(DeploymentSlot deploymentSlot)
	{
		this.deploymentSlot = deploymentSlot;
	}

	/**
	 * @return the deploymentType
	 */
	public DeploymentType getDeploymentType()
	{
		return deploymentType;
	}

	/**
	 * @param deploymentType
	 *            the deploymentType to set
	 */
	public void setDeploymentType(DeploymentType deploymentType)
	{
		this.deploymentType = deploymentType;
	}

	/**
	 * @return the portalName
	 */
	public String getPortalName()
	{
		return portalName;
	}

	/**
	 * @param portalName
	 *            the portalName to set
	 */
	public void setPortalName(String portalName)
	{
		this.portalName = portalName;
	}

	@Override
	public int compareTo(ResonatorDeployment o)
	{
		if (o.getDeploymentOrdinal() > this.getDeploymentOrdinal())
			return 1;
		else if (o.getDeploymentOrdinal() < this.getDeploymentOrdinal())
			return -1;
		else
			return 0;
	}

}
