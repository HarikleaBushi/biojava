/*
 *                    BioJava development code
 *
 * This code may be freely distributed and modified under the
 * terms of the GNU Lesser General Public Licence.  This should
 * be distributed with the code.  If you do not have a copy,
 * see:
 *
 *      http://www.gnu.org/copyleft/lesser.html
 *
 * Copyright for this code is held jointly by the individual
 * authors.  These should be listed in @author doc comments.
 *
 * For more information on the BioJava project and its aims,
 * or to join the biojava-l mailing list, visit the home page
 * at:
 *
 *      http://www.biojava.org/
 *
 * Created on 2011-11-20
 *
 */

package org.biojava3.ws.alignment.qblast2.enums;

/**
 * Enum representing available blast output formats. To use it as a parameter in
 * QBlast search use the {@linkplain #getValue()} method
 * 
 * @author Gediminas Rimsa
 */
public enum BlastOutputFormat2 {
	TEXT("Text"),
	XML("XML"),
	HTML("HTML");

	private final String type;

	private BlastOutputFormat2(String type) {
		this.type = type;
	}

	/**
	 * @return the value associated with this enum constant for use as a
	 *         parameter in QBlast search
	 */
	public String getValue() {
		return type;
	}
}