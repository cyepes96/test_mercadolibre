# Analyzer ADN  - XMEN


## Introduction 
This project is to analyze the DNA.

## Methods
It has 2 methods to use
- stats: It show you the statistics of human and mutants.  
	HTTP Method: GET  
	URL: https://test-mercadolibre.azurewebsites.net/xmen/stats  

- mutant: It say you if the DNA is a mutant or a human.  
	HTTP Method: POST  
	URL: https://test-mercadolibre.azurewebsites.net/xmen/mutant  
	Body example:
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

## Build and Test
TODO: Describe and show how to build your code and run the tests. 

## Contribute
TODO: Explain how other users and developers can contribute to make your code better. 

If you want to learn more about creating good readme files then refer the following [guidelines](https://docs.microsoft.com/en-us/azure/devops/repos/git/create-a-readme?view=azure-devops). You can also seek inspiration from the below readme files:
- [ASP.NET Core](https://github.com/aspnet/Home)
- [Visual Studio Code](https://github.com/Microsoft/vscode)
- [Chakra Core](https://github.com/Microsoft/ChakraCore)
