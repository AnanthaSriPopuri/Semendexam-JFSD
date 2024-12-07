package com.klef.jfsd.exam.labexamm;
import org.hibernate.criterion.*;
import java.util.List;

public static void aggregateFunctions(Session session) {
    Criteria criteria = session.createCriteria(Project.class);

    // Count
    criteria.setProjection(Projections.rowCount());
    System.out.println("Total Projects: " + criteria.uniqueResult());

    // Max Budget
    criteria.setProjection(Projections.max("budget"));
    System.out.println("Max Budget: " + criteria.uniqueResult());

    // Min Budget
    criteria.setProjection(Projections.min("budget"));
    System.out.println("Min Budget: " + criteria.uniqueResult());

    // Sum Budget
    criteria.setProjection(Projections.sum("budget"));
    System.out.println("Sum Budget: " + criteria.uniqueResult());

    // Average Budget
    criteria.setProjection(Projections.avg("budget"));
    System.out.println("Average Budget: " + criteria.uniqueResult());
}

