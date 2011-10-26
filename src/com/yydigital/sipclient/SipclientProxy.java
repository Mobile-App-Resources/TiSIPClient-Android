/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package com.yydigital.sipclient;

import java.text.ParseException;

import org.appcelerator.kroll.KrollProxy;
import org.appcelerator.kroll.annotations.Kroll;

import org.appcelerator.titanium.TiContext;

import android.net.sip.SipException;

// This proxy can be created by calling Sipclient.createSipclient({message: "hello world"})
@Kroll.proxy(creatableInModule=SipclientModule.class)
public class SipclientProxy extends KrollProxy
{
	// Standard Debugging variables
	//private static final String LCAT = "SipClient";
	//private static final boolean DBG = TiConfig.LOGD;
	private AndroidSIPClient client;
	// Constructor
	public SipclientProxy(TiContext tiContext) {
		super(tiContext);
		this.client = new AndroidSIPClient(this);
	}
	
	/*// Handle creation options
	@Override
	public void handleCreationDict(KrollDict options) {
		super.handleCreationDict(options);
		
		if (options.containsKey("message")) {
			Log.d(LCAT, "example created with message: " + options.get("message"));
		}
	}*/
	
	// Methods
	@Kroll.method
	public void register() throws ParseException, SipException {
		client.register();
	}
	@Kroll.method
	public void answer() throws ParseException, SipException {
		client.answer();
	}
	@Kroll.method
	public void close() throws ParseException, SipException {
		client.close();
	}
	@Kroll.method
	public void hangup() throws ParseException, SipException {
		client.hangup();
	}
	@Kroll.method
	public void holdCall() throws ParseException, SipException {
		client.holdCall();
	}
	@Kroll.method
	public void initiateCall(String address) throws ParseException, SipException {
		client.initiateCall(address);
	}
	@Kroll.method
	public void sendDTMF(int code) throws ParseException, SipException {
		client.sendDTMF(code);
	}
	@Kroll.method
	public void toggleMuted() throws ParseException, SipException {
		client.toggleMuted();
	}
	
	@Kroll.method
	public void unholdCall() throws ParseException, SipException {
		client.unholdCall();
	}
	
	@Kroll.getProperty
	public boolean getRegistered() {
		return client.isRegistered();
	}
	
	@Kroll.getProperty
	public boolean getInCall() {
		return client.isInCall();
	}

	@Kroll.getProperty
	public boolean getMuted() {
		return client.isMuted();
	}
	
	@Kroll.getProperty
	public boolean getOnHold() {
		return client.isOnHold();
	}
	
	@Kroll.setProperty
	public void setSpeakerMode(boolean value) {
		client.setSpeakerMode(value);
	}

}