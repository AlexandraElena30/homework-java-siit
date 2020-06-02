package com.siit.homeworks.homework07_TestOOP;

import com.siit.homeworks.homework07_TestOOP.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class DrawingToolTest {

    @Mock
    private DrawingTool sut;

//add all types of shapes, add duplicates, add single shape and pairs of shapes

    // perimeter #1
    @Test
    public void given_pair_shape_input_when_compute_sum_perimeter_then_sum_returned() {

        //given
        Circle c = new Circle(2);
        Square s = new Square(2);

        //When
        sut.addShape(c);
        sut.addShape(s);
        double returnedValue = sut.sumPerimeter();

        //Then
        assertThat(returnedValue).isEqualTo(20.566370614359172);

    }

    //perimeter #2
    @Test
    public void given_one_shape_input_when_compute_sum_perimeter_then_sum_returned() {

        //given
        Circle c = new Circle(2);

        //When
        sut.addShape(c);
        double returnedValue = sut.sumPerimeter();

        //Then
        assertThat(returnedValue).isEqualTo(12.566370614359172);

    }

    //perimeter #3
    @Test
    public void given_all_shape_input_when_compute_sum_perimeter_then_sum_returned() {

        //given
        Circle c = new Circle(2);
        Triangle t = new Triangle(2, 3, 4);
        Rectangle r = new Rectangle(2, 3);
        Square s = new Square(2);

        //When
        sut.addShape(c);
        sut.addShape(t);
        sut.addShape(r);
        sut.addShape(s);
        double returnedValue = sut.sumPerimeter();

        //Then
        assertThat(returnedValue).isEqualTo(39.56637061435917);

    }

    //perimeter #4
    @Test
    public void given_similar_shape_input_when_compute_sum_perimeter_then_sum_returned() {

        //given
        Circle c = new Circle(2);
        Circle c1 = new Circle(2);
        Triangle t = new Triangle(2, 3, 4);
        Rectangle r = new Rectangle(2, 3);
        Square s = new Square(2);

        //When
        sut.addShape(c);
        sut.addShape(c1);
        sut.addShape(t);
        sut.addShape(r);
        sut.addShape(s);
        double returnedValue = sut.sumPerimeter();

        //Then
        assertThat(returnedValue).isEqualTo(39.56637061435917);

    }

    // surface #1
    @Test
    public void given_pair_shape_input_when_compute_sum_area_then_sum_returned() {

        //given
        Circle c = new Circle(4);
        Square s = new Square(3);

        //When
        sut.addShape(c);
        sut.addShape(s);
        double returnedValue = sut.sumArea();

        //Then
        assertThat(returnedValue).isEqualTo(59.26548245743669);

    }

    // surface #2
    @Test
    public void given_one_shape_input_when_compute_sum_area_then_sum_returned() {

        //given
        Circle c = new Circle(3);

        //When
        sut.addShape(c);
        double returnedValue = sut.sumArea();

        //Then
        assertThat(returnedValue).isEqualTo(28.274333882308138);

    }

    // surface #3
    @Test
    public void given_all_shape_input_when_compute_sum_area_then_sum_returned() {

        //given
        Circle c = new Circle(3);
        Triangle t = new Triangle(1, 2, 3);
        Rectangle r = new Rectangle(1, 5);
        Square s = new Square(4);

        //When
        sut.addShape(c);
        sut.addShape(t);
        sut.addShape(r);
        sut.addShape(s);
        double returnedValue = sut.sumArea();

        //Then
        assertThat(returnedValue).isEqualTo(49.27433388230814);

    }

    // surface #4
    @Test
    public void given_similar_shape_input_when_compute_sum_area_then_sum_returned() {

        //given
        Circle c = new Circle(3);
        Circle c1 = new Circle(3);
        Triangle t = new Triangle(4, 5, 1);
        Rectangle r = new Rectangle(3, 6);
        Square s = new Square(8);

        //When
        sut.addShape(c);
        sut.addShape(c1);
        sut.addShape(t);
        sut.addShape(r);
        sut.addShape(s);
        double returnedValue = sut.sumArea();

        //Then
        assertThat(returnedValue).isEqualTo(110.27433388230814);

    }



    @Before
    public void setup() {
        sut = new DrawingTool();
    }

}
