package enums;

public enum ImageSQL {
	IMAGE_UPLOAD;
	@Override
	public String toString() {
		StringBuffer query = new StringBuffer();
		switch (this) {
		case IMAGE_UPLOAD: 
			query.append("INSERT INTO IMAGES(img_seq, img_name,img_Extention, owner)\r\n" + 
					"VALUES(img_seq.NEXTVAL, ?, ?, ?)");
			
			break;

		default:
			break;
		}
		
		
		return query.toString();
	}
	
}
