/**
 * Main.java - Driver class to demonstrate revised historical examples
 * 
 * @author Nathan Tshishimbi
 * @version 1.0 (02/26/2026)
 */
public class Main {
	public static void main(String[] args) {
		// String tulsaDescription = "A black teenager, who was working as a shoe shiner in downtown Tulsa, Oklahoma, was arrested and accused of assaulting a white woman on a public elevator in broad daylight. A group of white vigilantes, intent on lynching him, and armed black men intent on protecting him gathered at the courthouse. A shot rang out, and the violence began. The riot resulted in 35 square blocks of destruction, including more than 1,250 homes, churches, schools, businesses, a hospital, and a library.";
		// Date tulsaDay = new Date(5, 31, 1921);
		// HistoricalEvent tulsaRiot = new HistoricalEvent(tulsaDescription, tulsaDay);

		// System.out.println("====================================================");
		// System.out.println("HISTORICAL EVENT EXAMPLE:");
		// System.out.println("====================================================");
		// System.out.println(tulsaRiot);
		

		// String tulsaRevised = "It started with newspaper reports that a black man had assaulted a white elevator operator. He was arrested, and black World War I vets rushed to the courthouse to prevent a lynching. Whites were deputized and handed weapons, the shooting started and then it got out of hand. It was mob rule for two days, and the result was the complete devastation of the entire black community. The white mobs looted the homes and businesses before they set fire to the community. Planes circled mid-air and bombed what was known as Black Wall Street. The National Guard was called out after the governor declared martial law, and imprisoned all blacks that were not already in jail. More than 35 blocks were destroyed, along with more than 1,200 homes, and some 300 people died, mostly Blacks.",
		// 	tulsaCitation = "https://www.smithsonianmag.com/smithsonian-institution/long-lost-manuscript-contains-searing-eyewitness-account-tulsa-race-massacre-1921-180959251/";
		// RevisedHistoricalEvent tulsaMassacre = new RevisedHistoricalEvent(tulsaDescription, tulsaDay,
		// tulsaRevised, tulsaCitation);

		// System.out.println("\n====================================================");
		// System.out.println("REVISED HISTORICAL EVENT EXAMPLE:");
		// System.out.println("====================================================");
		// tulsaMassacre.teach();


		// Part 3: External Event (Memphis Massacre)
		//Original Info
		String memphisDescription = "In early May 1866, violence erupted in Memphis, Tennessee, between white residents, including police and firemen, and recently discharged Black Union soldiers. The incident was portrayed as a race riot started by Black soldiers resisting law enforcement. Over three days, dozens of African Americans were killed, and many homes and churches were burned.";
		Date memphisDay = new Date(5, 1, 1866);
		HistoricalEvent memphisRiot = new HistoricalEvent(memphisDescription, memphisDay);

		System.out.println("====================================================");
		System.out.println("MEMPHIS MASSACRE:");
		System.out.println("====================================================");
		System.out.println(memphisRiot);


		//Revised Info
		String memphisRevised = "The Memphis Massacre of 1866 was not simply a spontaneous 'race riot,' but an organized, targeted assault on Black freedom and progress during Reconstruction. Over three days, white mobs—including police officers, firefighters, and local officials—attacked Black neighborhoods in Memphis. The violence was largely in retaliation for Black veterans asserting their civil rights and social mobility after the Civil War. At least 46 Black people were murdered, over 90 were injured, five Black women were raped, and more than 100 Black-owned homes, churches, and schools were burned. No white perpetrators were punished. The massacre became a turning point in federal intervention in the South and helped lead to the passage of the 14th Amendment.", memphisCitation = "https://repository.lsu.edu/cgi/viewcontent.cgi?article=2306&context=cwbr&utm";
		RevisedHistoricalEvent memphisMassacre = new RevisedHistoricalEvent(memphisDescription, memphisDay, memphisRevised, memphisCitation);

		System.out.println("\n====================================================");
		System.out.println("REVISED MEMPHIS MASSACRE:");
		System.out.println("====================================================");
		memphisMassacre.teach();
	}
}