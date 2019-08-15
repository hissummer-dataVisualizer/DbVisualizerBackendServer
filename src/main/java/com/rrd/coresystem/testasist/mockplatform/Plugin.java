package com.rrd.coresystem.testasist.mockplatform;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Plugin {

	private int order;
	private int pluginId;
	private String pluginName;
	private String pluginContent;

}
