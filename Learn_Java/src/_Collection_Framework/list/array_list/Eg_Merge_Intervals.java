package _Collection_Framework.list.array_list;

import java.util.*;

class Interval{
 		int start;
 		int end;
 		Interval(){start=0;end=0;}
 		Interval(int s,int e){start=s;end=e; }
 }
/*
 * Definition for interval.
 * public class Interval{
 * 		int start;
 * 		int end;
 * 		Interval(){start=0;end=0;}
 * 		Interval(int s,int e){start=s;end=e; }
 * }
 */
public class Eg_Merge_Intervals {
		public ArrayList<Interval> insert(ArrayList<Interval> intervals,Interval newInterval){
			if(intervals==null) {
				intervals=new ArrayList<Interval>();
				intervals.add(newInterval);
				return intervals ;
			}else if(intervals.size()==0){
				intervals.add(newInterval);
				return intervals;
			}
			Interval toInsert=newInterval;
			int i=0;
			while(i<intervals.size()) {
				Interval current =intervals.get(i);
				if(current.end<toInsert.start) {
					i++;
					continue;
				}
				else if(toInsert.end<current.start) {
					 intervals.add(i, toInsert);
					 break;
				}
				else {
					toInsert.start=Math.min(toInsert.start, current.start);
					toInsert.end=Math.max(current.end, toInsert.end);
					intervals.remove(i);
				}
			}
			if(i==intervals.size())
				intervals.add( toInsert);
			return intervals ;
			
		}
		
}
