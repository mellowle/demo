/**
 * 
 */
package com.orderSys.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author mello
 */
@Table(name = "t_order")
@Entity
public class OrderEntity {
	private int orderId;
	private int userId;
	private boolean scheduling;
	private boolean preprocessing;
	private boolean processing;
	private boolean postprocessing;
	private boolean failed;
	private boolean completed;
	private Date startTime;
	private Date completeTime;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "OID", nullable = false, length = 9)
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	@Column(name = "USERID")
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Column(name = "SCHEDULING", nullable = false)
	public boolean isScheduling() {
		return scheduling;
	}

	public void setScheduling(boolean scheduling) {
		this.scheduling = scheduling;
	}

	@Column(name = "PREPROC", nullable = false)
	public boolean isPreprocessing() {
		return preprocessing;
	}

	public void setPreprocessing(boolean preprocessing) {
		this.preprocessing = preprocessing;
	}

	@Column(name = "PROC", nullable = false)
	public boolean isProcessing() {
		return processing;
	}

	public void setProcessing(boolean processing) {
		this.processing = processing;
	}

	@Column(name = "POSTPROC", nullable = false)
	public boolean isPostprocessing() {
		return postprocessing;
	}

	public void setPostprocessing(boolean postprocessing) {
		this.postprocessing = postprocessing;
	}

	@Column(name = "FAILED", nullable = false)
	public boolean isFailed() {
		return failed;
	}

	public void setFailed(boolean failed) {
		this.failed = failed;
	}

	@Column(name = "COMPLETED", nullable = false)
	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	@Column(name = "STARTTIME", nullable = false)
	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	@Column(name = "COMPLETETIME", nullable = true)
	public Date getCompleteTime() {
		return completeTime;
	}

	public void setCompleteTime(Date completeTime) {
		this.completeTime = completeTime;
	}

}
