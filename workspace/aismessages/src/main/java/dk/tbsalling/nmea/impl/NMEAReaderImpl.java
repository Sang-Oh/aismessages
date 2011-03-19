/*
 * AISMessages
 * - a java-based library for decoding of AIS messages from digital VHF radio traffic related
 * to maritime navigation and safety in compliance with ITU 1371.
 * 
 * (C) Copyright 2011 by S-Consult ApS, DK31327490, http://s-consult.dk, Denmark.
 * 
 * Released under the Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License.
 * For details of this license see the nearby LICENCE-full file, visit http://creativecommons.org/licenses/by-nc-sa/3.0/
 * or send a letter to Creative Commons, 171 Second Street, Suite 300, San Francisco, California, 94105, USA.
 * 
 * NOT FOR COMMERCIAL USE!
 * Contact sales@s-consult.dk to obtain a commercially licensed version of this software.
 * 
 */

package dk.tbsalling.nmea.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

import dk.tbsalling.nmea.ContentHandler;
import dk.tbsalling.nmea.NMEAReader;

public class NMEAReaderImpl implements NMEAReader {

	public void parse(InputStream input) throws IOException {
	}

	public void addContentHandler(ContentHandler handler) {
		contentHandlers.add(handler);
	}
	
	private Set<ContentHandler> contentHandlers = new HashSet<ContentHandler>();
}