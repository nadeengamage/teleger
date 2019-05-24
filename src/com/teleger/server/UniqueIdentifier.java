/**
 * The teleger chat is a local network communication system.
 *
 * @author  Nadeen Gamage
 * @version 1.0
 * @since   2019-05-22
 */
package com.teleger.server;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UniqueIdentifier {

	private static List<Integer> ids = new ArrayList<Integer>();
	private static final int RANGE = 10000;

	private static int index = 0;

	static {
		for (int i = 0; i < RANGE; i++) {
			ids.add(i);
		}
		Collections.shuffle(ids);
	}

	private UniqueIdentifier() {
	}

	public static int getIdentifier() {
		if (index > ids.size() - 1) index = 0;
		return ids.get(index++);
	}

}
