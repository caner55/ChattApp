package com.chatt.demo.model;

import java.util.Date;

import com.chatt.demo.UserList;

/**
 * The Class Conversation is a Java Bean class that represents a single chat
 * conversation message.
 */
public class Conversation
{


	public static final int STATUS_SENDING = 0;


	public static final int STATUS_SENT = 1;


	public static final int STATUS_FAILED = 2;

	private String msg;


	private int status = STATUS_SENT;


	private Date date;


	private String sender;


	public Conversation(String msg, Date date, String sender)
	{
		this.msg = msg;
		this.date = date;
		this.sender = sender;
	}


	public Conversation()
	{
	}


	public String getMsg()
	{
		return msg;
	}


	public void setMsg(String msg)
	{
		this.msg = msg;
	}


	public boolean isSent()
	{
		return UserList.user.getUsername().equals(sender);
	}


	public Date getDate()
	{
		return date;
	}

	/**
	 * Sets the date.
	 * 
	 * @param date
	 *            the new date
	 */
	public void setDate(Date date)
	{
		this.date = date;
	}

	/**
	 * Gets the sender.
	 * 
	 * @return the sender
	 */
	public String getSender()
	{
		return sender;
	}

	/**
	 * Sets the sender.
	 * 
	 * @param sender
	 *            the new sender
	 */
	public void setSender(String sender)
	{
		this.sender = sender;
	}

	/**
	 * Gets the status.
	 * 
	 * @return the status
	 */
	public int getStatus()
	{
		return status;
	}

	/**
	 * Sets the status.
	 * 
	 * @param status
	 *            the new status
	 */
	public void setStatus(int status)
	{
		this.status = status;
	}

}
