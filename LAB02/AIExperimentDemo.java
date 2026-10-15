class AIExperimentDemo {

    void boostExperiment(AIExperiment experiment) {
        System.out.println("  Inside boostExperiment, before = " + experiment.status());
        experiment.completedEpochs = experiment.completedEpochs + 10;
        System.out.println("  Inside boostExperiment, after = " + experiment.status());
    }

    public static void main(String[] args) {
        AIExperimentDemo demo = new AIExperimentDemo();

        AIExperiment imageModel = new AIExperiment();
        imageModel.experimentName = "ImageClassifierV1";
        imageModel.completedEpochs = 5;
        imageModel.targetEpochs = 50;

        AIExperiment textModel = new AIExperiment();
        textModel.experimentName = "UrduSentimentV1";
        textModel.completedEpochs = 12;
        textModel.targetEpochs = 40;

        System.out.println("=== INITIAL STATE ===");
        System.out.println(imageModel.status());
        System.out.println(textModel.status());

        imageModel.runEpochs(10);
        textModel.runEpochs(5, 3);

        System.out.println();
        System.out.println("=== AFTER runEpochs CALLS ===");
        System.out.println(imageModel.status());
        System.out.println(textModel.status());

        System.out.println();
        System.out.println("=== REMAINING EPOCHS ===");
        System.out.println(imageModel.experimentName + " remaining = " + imageModel.remainingEpochs());
        System.out.println(textModel.experimentName + " remaining = " + textModel.remainingEpochs());

        imageModel.runEpochs(20);
        System.out.println();

        System.out.println("=== AFTER CHANGING ONLY imageModel ===");
        System.out.println(imageModel.status());
        System.out.println(textModel.status() + " <-- unchanged");

        System.out.println();
        System.out.println("=== PASS-BY-VALUE EXPERIMENT ===");
        System.out.println("  Before : " + textModel.status());
        demo.boostExperiment(textModel);
        System.out.println("  After : " + textModel.status());
    }
}
