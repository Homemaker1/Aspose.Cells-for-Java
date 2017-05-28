package AsposeCellsExamples.TechnicalArticles;

import com.aspose.cells.Workbook;
import AsposeCellsExamples.Utils;

public class SetAutoRecoverProperty {
	public static void main(String[] args) throws Exception {

		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(SetAutoRecoverProperty.class) + "TechnicalArticles/";
		// Create workbook object
		Workbook workbook = new Workbook();

		// Read AutoRecover property
		System.out.println("AutoRecover: " + workbook.getSettings().getAutoRecover());

		// Set AutoRecover property to false
		workbook.getSettings().setAutoRecover(false);

		// Save the workbook
		workbook.save("SetAutoRecoverProperty_out.xlsx");

		// Read the saved workbook again
		workbook = new Workbook("SetAutoRecoverProperty_out.xlsx");

		// Read AutoRecover property
		System.out.println("AutoRecover: " + workbook.getSettings().getAutoRecover());

	}
}
