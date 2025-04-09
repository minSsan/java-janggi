package domain.position;

import domain.direction.Direction;

import java.util.List;
import java.util.stream.Stream;

public final class CastlePosition extends JanggiPosition {
    private final List<Direction> directions;

    public CastlePosition(int row, int col, Direction... linked) {
        super(row, col);
        this.directions = Stream.concat(defaultDirections.stream(), Stream.of(linked)).toList();
    }

    @Override
    public boolean isCastle() {
        return true;
    }

    @Override
    protected List<Direction> getLinkedDirections() {
        return directions;
    }
}
