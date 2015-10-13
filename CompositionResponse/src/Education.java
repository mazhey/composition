public class Education {
	private String[] education;

	public String[] getEducation() {
		return education;
	}

	public void setEducation(String[] education) {
		this.education = education;
	}

	protected static String[] schools = { "school1", "school2", "school3",
			"school4", "school5", "school6", "school7", "school8", "school9",
			"school10", "school11", "school12", "school13", "school14",
			"school15", "school16", "school17", "school18", "school19",
			"school20" };

	@Override
	public String toString() {
		String records = "";
		for (int i = 19; i > 8; i--) {
			records = schools[i];
			System.out.println(records);
		}
		return "";

	}

}
