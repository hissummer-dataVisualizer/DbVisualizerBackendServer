package com.rrd.coresystem.testasist.mockplatform;

import com.rrd.coresystem.testasist.mockplatform.MockRule.MockRuleBuilder;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UpstreamPolicy {

	private int weight;

}
