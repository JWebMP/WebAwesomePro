package com.jwebmp.webawesomepro.components.chart;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaChartTest
{
    // ── WaChart (general purpose) ──────────────────────────────────────

    @Test
    void rendersBasicChartTag()
    {
        var s = new WaChart<>().toString(true);
        System.out.println(s);

        assertTrue(s.contains("<wa-chart"), "Should render wa-chart tag");
        assertTrue(s.contains("</wa-chart>"), "Should have closing tag");
    }

    // ── WaBarChart ─────────────────────────────────────────────────────

    @Test
    void rendersBarChartTag()
    {
        var s = new WaBarChart<>().toString(true);
        System.out.println(s);

        assertTrue(s.contains("<wa-bar-chart"), "Should render wa-bar-chart tag");
        assertTrue(s.contains("</wa-bar-chart>"), "Should have closing tag");
    }

    @Test
    void rendersBarChartWithLabel()
    {
        var s = new WaBarChart<>("Sales Data").toString(true);
        System.out.println(s);

        assertTrue(s.contains("label=\"Sales Data\""), "Label attribute expected");
    }

    @Test
    void rendersBarChartWithAllAttributes()
    {
        var s = new WaBarChart<>("Revenue")
                .setDescription("Quarterly revenue overview")
                .setXAxisLabel("Quarter")
                .setYAxisLabel("Amount ($)")
                .setLegendPosition(LegendPosition.Bottom)
                .setStacked(true)
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("<wa-bar-chart"), "Should render wa-bar-chart tag");
        assertTrue(s.contains("label=\"Revenue\""), "Label expected");
        assertTrue(s.contains("description=\"Quarterly revenue overview\""), "Description expected");
        assertTrue(s.contains("x-axis-label=\"Quarter\""), "X axis label expected");
        assertTrue(s.contains("y-axis-label=\"Amount ($)\""), "Y axis label expected");
        assertTrue(s.contains("legend-position=\"bottom\""), "Legend position expected");
        assertTrue(s.contains("stacked"), "Stacked boolean attribute expected");
        assertTrue(s.contains("</wa-bar-chart>"), "Closing tag expected");
    }

    // ── WaLineChart ────────────────────────────────────────────────────

    @Test
    void rendersLineChartTag()
    {
        var s = new WaLineChart<>().toString(true);
        System.out.println(s);

        assertTrue(s.contains("<wa-line-chart"), "Should render wa-line-chart tag");
        assertTrue(s.contains("</wa-line-chart>"), "Should have closing tag");
    }

    @Test
    void rendersLineChartWithAxes()
    {
        var s = new WaLineChart<>("Trends")
                .setXAxisLabel("Month")
                .setYAxisLabel("Users")
                .setLegendPosition(LegendPosition.Top)
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("label=\"Trends\""), "Label expected");
        assertTrue(s.contains("x-axis-label=\"Month\""), "X axis label expected");
        assertTrue(s.contains("y-axis-label=\"Users\""), "Y axis label expected");
        assertTrue(s.contains("legend-position=\"top\""), "Legend position expected");
    }

    // ── WaPieChart ─────────────────────────────────────────────────────

    @Test
    void rendersPieChartTag()
    {
        var s = new WaPieChart<>().toString(true);
        System.out.println(s);

        assertTrue(s.contains("<wa-pie-chart"), "Should render wa-pie-chart tag");
        assertTrue(s.contains("</wa-pie-chart>"), "Should have closing tag");
    }

    @Test
    void rendersPieChartWithLegend()
    {
        var s = new WaPieChart<>("Market Share")
                .setLegendPosition(LegendPosition.Right)
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("label=\"Market Share\""), "Label expected");
        assertTrue(s.contains("legend-position=\"right\""), "Legend position expected");
    }

    // ── WaDoughnutChart ────────────────────────────────────────────────

    @Test
    void rendersDoughnutChartTag()
    {
        var s = new WaDoughnutChart<>().toString(true);
        System.out.println(s);

        assertTrue(s.contains("<wa-doughnut-chart"), "Should render wa-doughnut-chart tag");
        assertTrue(s.contains("</wa-doughnut-chart>"), "Should have closing tag");
    }

    @Test
    void rendersDoughnutChartWithDescription()
    {
        var s = new WaDoughnutChart<>("Budget")
                .setDescription("Spending breakdown")
                .setLegendPosition(LegendPosition.Left)
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("label=\"Budget\""), "Label expected");
        assertTrue(s.contains("description=\"Spending breakdown\""), "Description expected");
        assertTrue(s.contains("legend-position=\"left\""), "Legend position expected");
    }

    // ── WaBubbleChart ──────────────────────────────────────────────────

    @Test
    void rendersBubbleChartTag()
    {
        var s = new WaBubbleChart<>().toString(true);
        System.out.println(s);

        assertTrue(s.contains("<wa-bubble-chart"), "Should render wa-bubble-chart tag");
        assertTrue(s.contains("</wa-bubble-chart>"), "Should have closing tag");
    }

    @Test
    void rendersBubbleChartWithAxes()
    {
        var s = new WaBubbleChart<>("Correlations")
                .setXAxisLabel("Height")
                .setYAxisLabel("Weight")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("label=\"Correlations\""), "Label expected");
        assertTrue(s.contains("x-axis-label=\"Height\""), "X axis label expected");
        assertTrue(s.contains("y-axis-label=\"Weight\""), "Y axis label expected");
    }

    // ── WaRadarChart ───────────────────────────────────────────────────

    @Test
    void rendersRadarChartTag()
    {
        var s = new WaRadarChart<>().toString(true);
        System.out.println(s);

        assertTrue(s.contains("<wa-radar-chart"), "Should render wa-radar-chart tag");
        assertTrue(s.contains("</wa-radar-chart>"), "Should have closing tag");
    }

    @Test
    void rendersRadarChartWithLabel()
    {
        var s = new WaRadarChart<>("Skills")
                .setDescription("Team competency overview")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("label=\"Skills\""), "Label expected");
        assertTrue(s.contains("description=\"Team competency overview\""), "Description expected");
    }

    // ── WaScatterChart ─────────────────────────────────────────────────

    @Test
    void rendersScatterChartTag()
    {
        var s = new WaScatterChart<>().toString(true);
        System.out.println(s);

        assertTrue(s.contains("<wa-scatter-chart"), "Should render wa-scatter-chart tag");
        assertTrue(s.contains("</wa-scatter-chart>"), "Should have closing tag");
    }

    @Test
    void rendersScatterChartWithAxes()
    {
        var s = new WaScatterChart<>("Data Points")
                .setXAxisLabel("X")
                .setYAxisLabel("Y")
                .setLegendPosition(LegendPosition.Bottom)
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("label=\"Data Points\""), "Label expected");
        assertTrue(s.contains("x-axis-label=\"X\""), "X axis label expected");
        assertTrue(s.contains("y-axis-label=\"Y\""), "Y axis label expected");
        assertTrue(s.contains("legend-position=\"bottom\""), "Legend position expected");
    }

    // ── WaPolarAreaChart ───────────────────────────────────────────────

    @Test
    void rendersPolarAreaChartTag()
    {
        var s = new WaPolarAreaChart<>().toString(true);
        System.out.println(s);

        assertTrue(s.contains("<wa-polar-area-chart"), "Should render wa-polar-area-chart tag");
        assertTrue(s.contains("</wa-polar-area-chart>"), "Should have closing tag");
    }

    @Test
    void rendersPolarAreaChartWithLabel()
    {
        var s = new WaPolarAreaChart<>("Distribution")
                .setLegendPosition(LegendPosition.Right)
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("label=\"Distribution\""), "Label expected");
        assertTrue(s.contains("legend-position=\"right\""), "Legend position expected");
    }

    // ── WaSparkline ────────────────────────────────────────────────────

    @Test
    void rendersSparklineTag()
    {
        var s = new WaSparkline<>().toString(true);
        System.out.println(s);

        assertTrue(s.contains("<wa-sparkline"), "Should render wa-sparkline tag");
        assertTrue(s.contains("</wa-sparkline>"), "Should have closing tag");
    }

    // ── Stacked false omission ─────────────────────────────────────────

    @Test
    void omitsStackedWhenFalse()
    {
        var s = new WaBarChart<>("Test")
                .setStacked(false)
                .toString(true);
        System.out.println(s);

        assertFalse(s.contains("stacked=\"\""), "Stacked should not render when false");
    }

    // ── LegendPosition enum ────────────────────────────────────────────

    @Test
    void legendPositionToStringIsLowercase()
    {
        assertEquals("top", LegendPosition.Top.toString());
        assertEquals("bottom", LegendPosition.Bottom.toString());
        assertEquals("left", LegendPosition.Left.toString());
        assertEquals("right", LegendPosition.Right.toString());
    }
}

