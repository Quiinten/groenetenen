package be.vdab.valueobjects;

import javax.validation.constraints.NotNull;

import be.vdab.constraints.Postcode;
import be.vdab.constraints.PostcodeReeksVanKleinerDanOfGelijkAanTot;

@PostcodeReeksVanKleinerDanOfGelijkAanTot
public class PostcodeReeks {
	@Postcode
	@NotNull
	private Integer vanpostcode;
	@Postcode
	@NotNull
	private Integer totpostcode;

	public boolean bevat(Integer postcode) {
		// bevat de reeks een bepaalde postcode ? (gebruikt in de repository layer)
		return postcode >= vanpostcode && postcode <= totpostcode;
	}

	public Integer getVanpostcode() {
		return vanpostcode;
	}

	public Integer getTotpostcode() {
		return totpostcode;
	}

}