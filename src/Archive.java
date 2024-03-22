

import java.util.Objects;

public record Archive(String identifier, String name) {

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Archive comparedObject)) {
            return false;
        }

        return this.identifier.equals(comparedObject.identifier);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(identifier);
    }
}
