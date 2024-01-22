package practice;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class CsvGenerator {
	private static final String[] STARTUP_NAMES = { "ABC Startup", "XYZ Company", "Tech Innovators", "Global Solutions",
			"Future Enterprises", "Acme Corporation", "Alpha Industries", "Apex Solutions", "Arcadia Enterprises",
			"Atlas Technologies", "Aurora Innovations", "Axis Ventures", "Beacon Inc.", "Binary Systems",
			"Blue Moon Industries", "BrightStar Solutions", "Celerity Group", "Centauri Corporation",
			"Citadel Enterprises", "Cityscape Developments", "Clearview Analytics", "CodeCraft Technologies",
			"CosmoTech Solutions", "Crystal Dynamics", "Cybernautics Inc.", "Cyberscape Systems", "DataSpectrum",
			"Digital Frontier", "DreamWorks Innovations", "DynaTech Solutions", "EchoTech Solutions",
			"Elite Innovations", "Empyrean Technologies", "Enigma Dynamics", "Epoch Enterprises", "Eternity Solutions",
			"Everest Industries", "Excalibur Systems", "Falcon Enterprises", "Firebrand Technologies",
			"FirstWave Corporation", "FusionTech Solutions", "Galaxy Enterprises", "Genesis Innovations",
			"Global Network Solutions", "Goldrush Industries", "GreenLeaf Solutions", "Gridlock Systems",
			"Horizon Technologies", "Hyperion Corporation", "Imagineer Innovations", "Infinity Solutions",
			"InnoTech Solutions", "Insight Dynamics", "IntegraCorp", "Intrepid Innovations", "Jetstream Industries" };

	private static final String[] RETURN_TYPES = { "Monthly", "Quarterly", "Yearly" };

	public static void main(String[] args) {
		Random random = new Random();
		String csvFilePath = "startup_data.csv";

		try (FileWriter writer = new FileWriter(csvFilePath)) {
			writer.write(
					"Sr_No,Startup_Name,Startup_Age,Number_of_Partners,Annual_Turnover(in crore),Required_Investment(in crore),ReturnType,Return_Percentage\n");

			for (int i = 1; i <= 10000; i++) {
				int startupIndex = random.nextInt(STARTUP_NAMES.length);
				int startupAge = random.nextInt(20) + 1;
				int numPartners = random.nextInt(5) + 1;
				double annualTurnover = random.nextDouble() * 100;
				double requiredInvestment = random.nextDouble() * 10;
				String returnType = RETURN_TYPES[random.nextInt(RETURN_TYPES.length)];
				double returnPercentage = random.nextDouble() * 100;

				String entry = String.format("%d,%s,%d,%d,%.2f,%.2f,%s,%.2f\n", i, STARTUP_NAMES[startupIndex],
						startupAge, numPartners, annualTurnover, requiredInvestment, returnType, returnPercentage);
				writer.write(entry);
			}

			System.out.println("CSV file generated successfully: " + csvFilePath);
		} catch (IOException e) {
			System.err.println("Error writing CSV file: " + e.getMessage());
		}
	}
}
