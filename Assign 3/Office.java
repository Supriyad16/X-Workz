class Office{
	public static String owner(String company){
		System.out.println("To print the owner name when company name is given");
		
		if(company=="Google"){
			return "Stev";
		}
		
		if(company=="Microsoft"){
			return "Bill Gates ";
		}
		
		if(company=="Tesla"){
			return "Elon Musk";
		}
		
		if(company=="Zudio"){
			return "Tata";
		}
		
		if(company=="Jio"){
			return "Ambani";
		}
		
		if(company=="Infosys"){
			return "Murthy";
		}
		
		if(company=="Facebook"){
			return "Mark Zuckerberg";
		}
		
		if(company=="Lakme"){
			return "Sinmon";
		}
		
		if(company=="Zara"){
			return "Ortega";
		}
		
		if(company=="Nike"){
			return "Elliott";
		}
		
		if(company=="Gucci"){
			return "Guccio";
		}
		
		if(company=="Louis_Vuitton"){
			return "Louis";
		}
		return "not found";
	}
}