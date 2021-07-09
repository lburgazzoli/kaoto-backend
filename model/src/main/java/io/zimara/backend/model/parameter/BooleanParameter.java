package io.zimara.backend.model.parameter;

/**
 * 🐱class BooleanParameter
 * 🐱inherits Parameter
 * Parameter of type boolean
 */
public class BooleanParameter extends AbstractParameter {

    private final Boolean defaultValue;

    public BooleanParameter(String label) {
        this(label, label, false, "");
    }

    public BooleanParameter(String id, String label, Boolean defaultValue, String description) {
        super(id, label, description);
        this.defaultValue = defaultValue;
    }

    @Override
    public Boolean getDefault() {
        return this.defaultValue;
    }

    @Override
    public String getType() {
        return "BOOLEAN";
    }
}