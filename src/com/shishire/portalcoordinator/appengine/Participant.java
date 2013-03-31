/**
 * 
 */
package com.shishire.portalcoordinator.appengine;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * @author Shishire
 * 
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Participant
{
	protected String participantId;

	/**
	 * @return the participantId
	 */
	public String getParticipantId()
	{
		return participantId;
	}

	/**
	 * @param participantId
	 *            the participantId to set
	 */
	public void setParticipantId(String participantId)
	{
		this.participantId = participantId;
	}

	public Participant(String participantId)
	{
		this.participantId = participantId;
	}

	public Participant()
	{

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((participantId == null) ? 0 : participantId.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (!(obj instanceof Participant)) return false;
		Participant other = (Participant) obj;
		if (participantId == null)
		{
			if (other.participantId != null) return false;
		}
		else if (!participantId.equals(other.participantId)) return false;
		return true;
	}
}
