package com.rp.common.util;

import java.util.UUID;

public class Util {

	public static String getUUID() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString().replace("-", "");
	}

}
