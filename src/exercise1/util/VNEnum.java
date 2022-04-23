package exercise1.util;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public enum VNEnum {
	VISUAL(1, "Visual"),
	NUTS (2, "Nuts"),
	VISUAL_NUTS(3, "Visual Nuts");
	
	public static VNEnum getDescription(Integer id){
		VNEnum value = null;
		if(id!= null) {
			if(VISUAL.id == id){
				value = VISUAL;
			} else if(NUTS.id == id){
				value = NUTS;
			}else if(VISUAL_NUTS.id == id){
				value = VISUAL_NUTS;
			}
		}
		return value;
	}

	private Integer id;
	private String description;

}