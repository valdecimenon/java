package collectors;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

// A interface Collector nada mais é que uma junção de várias interfaces funcionais
public class InterfaceCollector implements Collector<String, Double, Integer> {

	@Override
	public Supplier<Double> supplier() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BiConsumer<Double, String> accumulator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BinaryOperator<Double> combiner() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Function<Double, Integer> finisher() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Characteristics> characteristics() {
		// TODO Auto-generated method stub
		return null;
	}

}
