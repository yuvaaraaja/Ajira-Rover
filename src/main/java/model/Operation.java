package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Operation {

    @JsonProperty("collect-sample")
    private SampleCollection collectSample;
    @JsonProperty("item-usage")
    private ItemUsage itemUsage;

    @JsonProperty("collect-sample")
    public SampleCollection getCollectSample() {
        return collectSample;
    }

    @JsonProperty("collect-sample")
    public void setCollectSample(SampleCollection collectSample) {
        this.collectSample = collectSample;
    }

    @JsonProperty("item-usage")
    public ItemUsage getItemUsage() {
        return itemUsage;
    }

    @JsonProperty("item-usage")
    public void setItemUsage(ItemUsage itemUsage) {
        this.itemUsage = itemUsage;
    }
}
