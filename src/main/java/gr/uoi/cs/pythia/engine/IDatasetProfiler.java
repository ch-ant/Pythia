package gr.uoi.cs.pythia.engine;

import gr.uoi.cs.pythia.labeling.RuleSet;
import gr.uoi.cs.pythia.model.DatasetProfile;
import org.apache.spark.sql.types.StructType;

public interface IDatasetProfiler {

  void registerDataset(String alias, String path, StructType schema);

  void computeLabeledColumn(RuleSet ruleSet);

  DatasetProfile computeProfileOfDataset();

  void generateReport(String reportGeneratorType, String path);

  void writeDataset(String datasetWriterType, String path);
}