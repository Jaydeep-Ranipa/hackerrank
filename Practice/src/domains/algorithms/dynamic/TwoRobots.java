package domains.algorithms.dynamic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * @author Jaydeep Ranipa
 *
 */
public class TwoRobots {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t-- > 0) {
			// TODO For each test case

			@SuppressWarnings("unused")
			int m = input.nextInt(); // number of containers
			int n = input.nextInt(); // number of queries

			/** List of queries */
			List<Query> queries = new ArrayList<Query>();
			for (int i = 0; i < n; i++) {
				Query q = new Query();
				q.start = input.nextInt();
				q.end = input.nextInt();
				queries.add(q);
			}

			int r1 = 1; // robot 1 position
			int r2 = 1; // robot 2 position

			int totalDistance = 0;

			int i = 1;
			for (Query query : queries) {
				if (i == 1) {
					r1 = query.start;
				}
				if (i == 2) {
					r2 = query.start;
				}
				System.out.println("-----------------");
				// distance between 2 containers of query
				int queryDist = Math.abs(query.start - query.end);

				System.out.println(query);
				System.out.println("queryDist: " + queryDist);

				// whichever robot is nearer to the start container of query
				// will go to address the query
				if (Math.abs(r1 - query.start) <= Math.abs(r2 - query.start)) {
					System.out.println(
							"robot: r1 travels to " + query.start + " for " + Math.abs(r1 - query.start) + " steps.");

					// distance to travel up to start container plus queryDist
					totalDistance += Math.abs(r1 - query.start) + queryDist;
					// updating robot position
					r1 = query.end;
				} else {
					System.out.println(
							"robot: r2 travels to " + query.start + " for " + Math.abs(r2 - query.start) + " steps.");

					totalDistance += Math.abs(r2 - query.start) + queryDist;
					r2 = query.end;
				}

				System.out.println("After processing query: r1=" + r1 + " & r2=" + r2);
				i++;
			}

			System.out.println(totalDistance);
		}
	}
}

class Query {
	int start;
	int end;

	public Query() {
		super();
	}

	/**
	 * @param start
	 * @param end
	 */
	public Query(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}

	@Override
	public String toString() {
		return "Query [start=" + start + ", end=" + end + "]";
	}
}