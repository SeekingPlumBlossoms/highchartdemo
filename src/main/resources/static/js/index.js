var chart = Highcharts.chart('container', {
    chart: {
        zoomType: 'xy'
    },
    title: {
        text: '用户分析'
    },
    subtitle: {
        text: '数据来源: MQ'
    },
    xAxis: [{
        categories: [
            '201801', '201802', '201803', '201804', '201805', '201806','201807', '201808', '201809', '201810', '201811', '201812'
        ],
        crosshair: true
    }],
    yAxis: [{ // Primary yAxis
        labels: {
            format: '{value}',
            style: {
                color: Highcharts.getOptions().colors[2]
            }
        },
        title: {
            text: '累计关注人数',
            style: {
                color: Highcharts.getOptions().colors[2]
            }
        },
        opposite: true
    }, { // Secondary yAxis
        gridLineWidth: 0,
        title: {
            text: '新关注人数',
            style: {
                color: Highcharts.getOptions().colors[0]
            }
        },
        labels: {
            format: '{value}',
            style: {
                color: Highcharts.getOptions().colors[0]
            }
        }
    }
        //,{ // Tertiary yAxis
        //gridLineWidth: 0,
        // title: {
        //     text: '取消关注人数',
        //     style: {
        //         color:  Highcharts.getOptions().colors[1]
        //     }
        // },
    //     labels: {
    //        // format: '{value}',
    //         style: {
    //             color:  Highcharts.getOptions().colors[1]
    //         }
    //     },
    //     opposite: true
    // }
        ],
    tooltip: {
        shared: true
    },
    legend: {
        layout: 'horizontal',
        align: 'center',
        verticalAlign: 'bottom',
        floating: false,
        backgroundColor: (Highcharts.theme && Highcharts.theme.legendBackgroundColor) || '#FFFFFF'
    },
    series: [{
        name: '新关注人数',
        type: 'column',
        yAxis: 1,
        data: [783387, 861003, 741612, 560220, 496171, 439833, 439681, 399307, 446633, 390851, 348967, 332215],
        tooltip: {
            valueSuffix: ''
        }
    }, {
        name: '取消关注人数',
        type: 'column',
        yAxis: 1,
        data: [49231, 27877, 20568, 54626, 28349, 23158, 56025, 32668, 23878, 39513, 27439, 31429],
        tooltip: {
            valueSuffix: ''
        },
        color: "#fa252c"
    }, {
        name: '累计关注人数',
        type: 'spline',
        data: [293186937,294020035,294740649,295246182,295713973,296130613,296514237,296880858,297303597,297654908,297976413,298277171],
        tooltip: {
            valueSuffix: ''
        },
        color: "#0efa23"
    }]
});

function shuXin() {

       // chart.xAxis[0].categories.push(['201901', '201902', '201903', '201904', '201905', '201906','201907', '201908', '201909', '201910', '201911', '201912']);
    chart.xAxis[0].categories=['201901', '201902', '201903', '201904', '201905', '201906','201907', '201908', '201909', '201910', '201911', '201912'];
    var inc=[783387, 861003, 741612, 560220, 496171, 439833, 439681, 399307, 446633, 390851, 348967, 332215];
    for(var i=0;i<inc.length;i++){
        inc[i]=inc[i]*10*i;
    }
    chart.series[0].setData(inc);
    chart.redraw(false)
}
