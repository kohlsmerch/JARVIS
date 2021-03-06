package com.build.classes.hibernate;

// Generated Jun 29, 2015 7:26:16 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * JatEventConfig generated by hbm2java
 */
public class JatEventConfig implements java.io.Serializable {

	private Integer eventConfigId;
	private JatEventHost jatEventHost;
	private JatEventType jatEventType;
	private JatEvent jatEvent;
	private String eventEmailId;
	private Character status;
	private Date createdTimestamp;
	private String createdBy;
	private Date lastUpdatedTimestamp;

	public JatEventConfig() {
	}

	public JatEventConfig(JatEventHost jatEventHost, JatEventType jatEventType,
			JatEvent jatEvent, String eventEmailId, Character status,
			Date createdTimestamp, String createdBy, Date lastUpdatedTimestamp) {
		this.jatEventHost = jatEventHost;
		this.jatEventType = jatEventType;
		this.jatEvent = jatEvent;
		this.eventEmailId = eventEmailId;
		this.status = status;
		this.createdTimestamp = createdTimestamp;
		this.createdBy = createdBy;
		this.lastUpdatedTimestamp = lastUpdatedTimestamp;
	}

	public Integer getEventConfigId() {
		return this.eventConfigId;
	}

	public void setEventConfigId(Integer eventConfigId) {
		this.eventConfigId = eventConfigId;
	}

	public JatEventHost getJatEventHost() {
		return this.jatEventHost;
	}

	public void setJatEventHost(JatEventHost jatEventHost) {
		this.jatEventHost = jatEventHost;
	}

	public JatEventType getJatEventType() {
		return this.jatEventType;
	}

	public void setJatEventType(JatEventType jatEventType) {
		this.jatEventType = jatEventType;
	}

	public JatEvent getJatEvent() {
		return this.jatEvent;
	}

	public void setJatEvent(JatEvent jatEvent) {
		this.jatEvent = jatEvent;
	}

	public String getEventEmailId() {
		return this.eventEmailId;
	}

	public void setEventEmailId(String eventEmailId) {
		this.eventEmailId = eventEmailId;
	}

	public Character getStatus() {
		return this.status;
	}

	public void setStatus(Character status) {
		this.status = status;
	}

	public Date getCreatedTimestamp() {
		return this.createdTimestamp;
	}

	public void setCreatedTimestamp(Date createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getLastUpdatedTimestamp() {
		return this.lastUpdatedTimestamp;
	}

	public void setLastUpdatedTimestamp(Date lastUpdatedTimestamp) {
		this.lastUpdatedTimestamp = lastUpdatedTimestamp;
	}

}
