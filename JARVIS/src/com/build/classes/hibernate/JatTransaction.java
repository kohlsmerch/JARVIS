package com.build.classes.hibernate;

// Generated Jun 29, 2015 7:26:16 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * JatTransaction generated by hbm2java
 */
public class JatTransaction implements java.io.Serializable {

	private int tranId;
	private JatLogic jatLogic;
	private JatEvent jatEvent;
	private Date execStartTime;
	private Date execStopTime;
	private String outcome;
	private String exceptionMessage;

	public JatTransaction() {
	}

	public JatTransaction(int tranId) {
		this.tranId = tranId;
	}

	public JatTransaction(int tranId, JatLogic jatLogic, JatEvent jatEvent,
			Date execStartTime, Date execStopTime, String outcome,
			String exceptionMessage) {
		this.tranId = tranId;
		this.jatLogic = jatLogic;
		this.jatEvent = jatEvent;
		this.execStartTime = execStartTime;
		this.execStopTime = execStopTime;
		this.outcome = outcome;
		this.exceptionMessage = exceptionMessage;
	}

	public int getTranId() {
		return this.tranId;
	}

	public void setTranId(int tranId) {
		this.tranId = tranId;
	}

	public JatLogic getJatLogic() {
		return this.jatLogic;
	}

	public void setJatLogic(JatLogic jatLogic) {
		this.jatLogic = jatLogic;
	}

	public JatEvent getJatEvent() {
		return this.jatEvent;
	}

	public void setJatEvent(JatEvent jatEvent) {
		this.jatEvent = jatEvent;
	}

	public Date getExecStartTime() {
		return this.execStartTime;
	}

	public void setExecStartTime(Date execStartTime) {
		this.execStartTime = execStartTime;
	}

	public Date getExecStopTime() {
		return this.execStopTime;
	}

	public void setExecStopTime(Date execStopTime) {
		this.execStopTime = execStopTime;
	}

	public String getOutcome() {
		return this.outcome;
	}

	public void setOutcome(String outcome) {
		this.outcome = outcome;
	}

	public String getExceptionMessage() {
		return this.exceptionMessage;
	}

	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}

}
