import java.util.ArrayList;
import java.io.*;
import compiler.lib.*;
import compiler.scanner.Scanner;

import compiler.lib.Printer;

import compiler.ast.Ast;
import compiler.semantic.Semantic;
import compiler.irt.Irt;
import compiler.codegen.Codegen;
import compiler.parser.CC4Parser;

public class Compiler{
	public static void main(String[] args) throws Exception{
		if (args.length>0){
			
			String filename = args[args.length-1];
			String fileout="Copy"+filename;
			//boolean debug = false;
			String sdebug = "";
			
			
			ArrayList<String> options = new ArrayList<String>();
			if (args.length==1){
				if(args[0].equals("-h")){
					System.out.println("Esta es una ayuda para el usuario, opciones disponibles: ");
					System.out.println("-o");
					System.out.println("-target");
					System.out.println("-opt");
					System.out.println("-debug");
					System.exit(0);
				}
				if(args[0].contains(".")){
					Printer out = new Printer(fileout);
					Scanner sc = new Scanner(out,filename,sdebug);
					CC4Parser pa = new CC4Parser(sc);
					Ast as = new Ast(pa);
					Semantic sem = new Semantic(as);
					Irt ir = new Irt(sem);
					Codegen code = new Codegen(ir);
					out.close();
				}else{
					ErrorHandler e = new ErrorHandler("not existing file");
				}
			}
			for(int i = 0;i<=args.length-2;i++){
				switch(args[i]){
					case "-o":
						if(!options.contains(args[i])){
							options.add(args[i]);
							if(args[i+1].charAt(0)=='-'){
								ErrorHandler e = new ErrorHandler("missing -o complement");
							}else{
								fileout=args[i+1];
								i++;
							}
						}else{
							i++;
						}
						break;
					case "-target":
						if(!options.contains(args[i])){
							options.add(args[i]);
							if(args[i+1].charAt(0)=='-' || args[i+1].contains(".")){
								ErrorHandler e = new ErrorHandler("missing -target complement");
							}else{
								switch(args[i+1]){
									case "scan":
										options.add(args[i+1]);
										i++;
										break;
									case "parser":
										options.add(args[i+1]);
										i++;
										break;
									case "ast":
										options.add(args[i+1]);
										i++;
										break; 
									case "semantic":
										options.add(args[i+1]);
										i++;
										break;
									case "irt":
										options.add(args[i+1]);
										i++;
										break;
									case "codegen":
										options.add(args[i+1]);
										i++;
										break;
									default:
										ErrorHandler e = new ErrorHandler("missing -target complement");
										break;
								}
								i++;
							}
						}else{
							i++;
						}
						break;
					case "-opt":
						if(!options.contains(args[i])){
							options.add(args[i]);
							if(args[i+1].charAt(0)=='-' || args[i+1].contains(".")){
								ErrorHandler e = new ErrorHandler("missing -opt complement");
							}else{
								options.add(args[i+1]);
								i++;
							}
						}else{
							i++;
						}
						break;
					case "-debug":
						if(!options.contains(args[i])){
							options.add(args[i]);
							if(args[i+1].charAt(0)=='-' || args[i+1].contains(".")){
								ErrorHandler e = new ErrorHandler("missing -debug complement");
							}else{
								sdebug=args[i+1];
								i++;
							}
						}else{
							i++;
						}
						break;
					default:
						break;
				}				
			}
			for(int j = 0; options.size()>j;j++){
				if(options.size()>= 2)
				switch(options.get(options.size()-2)){
					case "-target":
						Printer out = new Printer(fileout);
						switch(options.get(j)){
									case "scan":
										Scanner s = new Scanner(out,filename,sdebug);
										out.close();
										break;
									case "parser":
										Scanner sp = new Scanner(out,filename,sdebug);
										CC4Parser pp = new CC4Parser(sp);
										out.close();
										break;
									case "ast":
										Scanner sa = new Scanner(out,filename,sdebug);
										CC4Parser pa = new CC4Parser(sa);
										Ast aa = new Ast(pa);
										out.close();
										break; 
									case "semantic":
										Scanner ss = new Scanner(out,filename,sdebug);
										CC4Parser ps = new CC4Parser(ss);
										Ast as = new Ast(ps);
										Semantic ses = new Semantic(as);
										out.close();
										break;
									case "irt":
										Scanner si = new Scanner(out,filename,sdebug);
										CC4Parser pi = new CC4Parser(si);
										Ast ai = new Ast(pi);
										Semantic sei = new Semantic(ai);
										Irt ii = new Irt(sei);
										out.close();
										break;
									case "codegen":
										Scanner sc = new Scanner(out,filename,sdebug);
										CC4Parser pc = new CC4Parser(sc);
										Ast ac = new Ast(pc);
										Semantic sec = new Semantic(ac);
										Irt ic = new Irt(sec);
										Codegen cc = new Codegen(ic);
										out.close();
										break;
									default:
									ErrorHandler e = new ErrorHandler("missing -target complement");
									break;
								}
						break;
					case "-opt":
						System.out.println("solo se optimizara: "+ options.get(j));
						break;
					case "-h":
						System.out.println("Esta es una ayuda para el usuario, opciones disponibles: ");
						System.out.println("-o");
						System.out.println("-target");
						System.out.println("-opt");
						System.out.println("-debug");
						System.exit(0);
						break;
					default:
						break;
				}
			}
		}else{
			System.out.println("Esta es una ayuda para el usuario, opciones disponibles: ");
			System.out.println("-o");
			System.out.println("-target");
			System.out.println("-opt");
			System.out.println("-debug");
			System.exit(0);
		}
	}
}