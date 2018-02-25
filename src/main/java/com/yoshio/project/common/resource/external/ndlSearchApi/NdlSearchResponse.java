package com.yoshio.project.common.resource.external.ndlSearchApi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
@XmlRootElement(name = "NdlSearchResponse")
public class NdlSearchResponse {

	//	@XmlElement(name = "Version")
	//	@XmlAttribute(name = "version")
	@XmlElement(name = "version")
	private String version;

	@XmlElement(name = "numbreOfRecords")
	private String numbreOfRecords;

}
