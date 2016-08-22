package com.QuABaseBD.staticClasses;

/**
 * Created by andrewdickens on 7/17/16.
 */
public class ArrayParser {

		/**
		 *
		 * @param input
		 * @return
		 *
		 * Parses input String into a matrix
		 */
		public static String[][] parseStringToArray(String input){
				String[] charactersRemoved = removeNewLine(toArray(input));

				String[][] matrix = to2DArray(charactersRemoved);

				for(int i=0; i<charactersRemoved.length; i++){
						System.out.println("row " + i + " is " + matrix[i][0] + " | " + matrix[i][1]);
				}

				return matrix;
		}

		/**
		 *
		 * @param input
		 * @return
		 *
		 * Parses input String into an array of Strings, delimited by newline
		 */
		public static String[] toArray(String input){
				String[] returnValue = input.split("\n");

				for(int i=0; i<returnValue.length; i++) {
						returnValue[i]=returnValue[i].replace("{{", "").replace("|", "").replace("}}", "");
				}


				return returnValue;
		}

		/**
		 *
		 * @param input
		 * @return
		 *
		 * Removes blank newlines from the array
		 */
		public static String[] removeNewLine(String[] input){
				int count=1;
				for(int i=0; i<input.length; i++){
						if(input[i].contains("=")){
								count++;
						}
				}

				String[] returnValue = new String[count];

				int x=1;
				returnValue[0] = input[0];
				for(int i=1; i<input.length; i++){
						if(input[i].contains("=")){
								returnValue[x] = input[i];
								x++;
						}
				}

				return returnValue;
		}

		/**
		 *
		 * @param input
		 * @return
		 *
		 * Converts String array to matrix
		 */
		public static String[][] to2DArray(String[] input){

				int count=0;
				for(int i=0; i<input.length; i++){
						count = count+1;
				}

				String[][] returnMatrix = new String[count][2];

				returnMatrix[0][0] = input[0];
				returnMatrix[0][1] = "NO_VALUE";

				for(int i=1; i<count; i++){
						String[] parsedArray;
						parsedArray = input[i].split("=");

						returnMatrix[i][0] = parsedArray[0];
						returnMatrix[i][1] = parsedArray[1];
				}

				return returnMatrix;
		}


}
