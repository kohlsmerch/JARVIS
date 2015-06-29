package com.build.classes.hibernate;

// Generated Jun 29, 2015 7:26:16 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * JatEvent generated by hbm2java
 */
public class JatEvent implements java.io.Serializable {

	private Integer eventId;
	private String eventSummary;
	private String eventDesc;
	private Character status;
	private Date createdTimestamp;
	private String createdBy;
	private Date lastUpdatedTimestamp;
	private String lastUpdatedBy;
	private Set<JatLogic> jatLogics = new HashSet<JatLogic>(0);
	private Set<JatEventConfig> jatEventConfigs = new HashSet<JatEventConfig>(0);
	private Set<JatTransaction> jatTransactions = new HashSet<JatTransaction>(0);

	public JatEvent() {
	}

	public JatEvent(String eventSummary, String eventDesc, Character status,
			Date createdTimestamp, String createdBy, Date lastUpdatedTimestamp,
			String lastUpdatedBy, Set<JatLogic> jatLogics,
			Set<JatEventConfig> jatEventConfigs,
			Set<JatTransaction> jatTransactions) {
		this.eventSummary = eventSummary;
		this.eventDesc = eventDesc;
		this.status = status;
		this.createdTimestamp = createdTimestamp;
		this.createdBy = createdBy;
		this.lastUpdatedTimestamp = lastUpdatedTimestamp;
		this.lastUpdatedBy = lastUpdatedBy;
		this.jatLogics = jatLogics;
		this.jatEventConfigs = jatEventConfigs;
		this.jatTransactions = jatTransactions;
	}

	public Integer getEventId() {
		return this.eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}

	public String getEventSummary() {
		return this.eventSummary;
	}

	public void setEventSummary(String eventSummary) {
		this.eventSummary = eventSummary;
	}

	public String getEventDesc() {
		return this.eventDesc;
	}

	public void setEventDesc(String eventDesc) {
		this.eventDesc = eventDesc;
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

	public String getLastUpdatedBy() {
		return this.lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public Set<JatLogic> getJatLogics() {
		return this.jatLogics;
	}

	public void setJatLogics(Set<JatLogic> jatLogics) {
		this.jatLogics = jatLogics;
	}

	public Set<JatEventConfig> getJatEventConfigs() {
		return this.jatEventConfigs;
	}

	public void setJatEventConfigs(Set<JatEventConfig> jatEventConfigs) {
		this.jatEventConfigs = jatEventConfigs;
	}

	public Set<JatTransaction> getJatTransactions() {
		return this.jatTransactions;
	}

	public void setJatTransactions(Set<JatTransaction> jatTransactions) {
		this.jatTransactions = jatTransactions;
	}

}