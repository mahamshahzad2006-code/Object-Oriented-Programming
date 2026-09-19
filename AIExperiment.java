class AIExperiment {
    String experimentName;
    int completedEpochs;
    int targetEpochs;

    void runEpochs(int epochs) {
        completedEpochs = completedEpochs + epochs;
    }

    void runEpochs(int epochs, int bonusEpochs) {
        int totalThisRun = epochs + bonusEpochs;
        completedEpochs = completedEpochs + totalThisRun;
    }

    int remainingEpochs() {
        int remaining = targetEpochs - completedEpochs;
        return remaining;
    }

    String status() {
        return experimentName + " : " + completedEpochs + "/" + targetEpochs
                + " epochs done, " + remainingEpochs() + " remaining";
    }
}
