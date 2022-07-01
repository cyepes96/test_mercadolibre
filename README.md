# DNA Analyzer  - XMEN

## Introduction 
This project is to analyze the DNA and evaluate if it is mutant or human.

## Methods
It has 2 methods to use
- **stats:** It show you the statistics of human and mutants.  
**HTTP Method:** GET  
**URL:** https://test-mercadolibre.azurewebsites.net/xmen/stats  

- **mutant:** It say you if the DNA is a mutant or a human.  
**HTTP Method:** POST  
**URL:** https://test-mercadolibre.azurewebsites.net/xmen/mutant  
**Body example:**
{
	"dna": [
		"TTTTGT",
		"AATTGG",
		"GTCAAA",
		"ATATCC",
		"TCGAGT",
		"ATTTAG"
	]
}