package com.github.mongobee;

import org.apache.commons.lang.StringUtils;

public class MongobeeUtil
{

	public static boolean hasText(String text)
	{
		return StringUtils.isNotEmpty(text);
	}
}
