package com.nestedGenericList;

import java.util.ArrayList;
import java.util.List;

public class University {
	
	public List<List<String>> universityList() {
		
		List<String> Fergusson_College = new ArrayList<String>();
		Fergusson_College.add("B.Sc (Computer Science / Biotechnology)");
		Fergusson_College.add("B.A (Economics / Psychology)");
		Fergusson_College.add("M.Sc (Various Science specializations)");
		
		List<String> COEP = new ArrayList<String>();
		COEP.add("B.Tech (Computer Engineering)");
		COEP.add("B.Tech (Mechanical Engineering)");
		COEP.add("M.Tech (Civil / Electrical Engineering)");
		
		List<String> Symbiosis_College = new ArrayList<String>();
		Symbiosis_College.add("B.Com (Accounting & Finance)");
		Symbiosis_College.add("B.A (Economics / English)");
		Symbiosis_College.add("M.A (Psychology / Economics)");
		
		List<List<String>> SPPU = new ArrayList<List<String>>();
		SPPU.add(Fergusson_College);
		SPPU.add(COEP);
		SPPU.add(Symbiosis_College);
		
		return SPPU;
	}
}
